import logging
import requests
from retry import retry

from service.config import BFF_HOST


logger = logging.getLogger()


class BFFStatusWebhookError(Exception):
    pass

@retry(BFFStatusWebhookError, delay=3, tries=10)
def notify_status(transaction_id, status):
    try:
        resp = requests.patch(
            f"{BFF_HOST}/api/v1/transactions/{transaction_id}/status",
            json={"status": status},
        )

    except Exception as err:
        logging.error(f"failed to update status: {str(err)}")
        raise BFFStatusWebhookError(Exception)
