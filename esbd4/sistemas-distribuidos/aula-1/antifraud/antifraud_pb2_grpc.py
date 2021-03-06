# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

import antifraud_pb2 as antifraud__pb2


class AntifraudAPIStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.AntifraudAssesment = channel.unary_unary(
                '/antifraud.v1.AntifraudAPI/AntifraudAssesment',
                request_serializer=antifraud__pb2.AntifraudAssesmentRequest.SerializeToString,
                response_deserializer=antifraud__pb2.AntifraudAssesmentResponse.FromString,
                )


class AntifraudAPIServicer(object):
    """Missing associated documentation comment in .proto file."""

    def AntifraudAssesment(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_AntifraudAPIServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'AntifraudAssesment': grpc.unary_unary_rpc_method_handler(
                    servicer.AntifraudAssesment,
                    request_deserializer=antifraud__pb2.AntifraudAssesmentRequest.FromString,
                    response_serializer=antifraud__pb2.AntifraudAssesmentResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'antifraud.v1.AntifraudAPI', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class AntifraudAPI(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def AntifraudAssesment(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/antifraud.v1.AntifraudAPI/AntifraudAssesment',
            antifraud__pb2.AntifraudAssesmentRequest.SerializeToString,
            antifraud__pb2.AntifraudAssesmentResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
