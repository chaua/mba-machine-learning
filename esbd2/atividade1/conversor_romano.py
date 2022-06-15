import re


class ConversorRomano:
    """
    Conversor de números em algarismos romanos para algarismos arábicos.
    """

    __NUMERAIS_ROMANOS_UNICOS = {
        'M': 1000,
        'D': 500,
        'C': 100,
        'L': 50,
        'X': 10,
        'V': 5,
        'I': 1,
    }

    __NUMERAIS_ROMANOS_DUPLOS = {
        'CM': 900,
        'CD': 400,
        'XC': 90,
        'XL': 40,
        'IX': 9,
        'IV': 4,
    }

    def to_int(self, romano: str) -> int:

        # Valida o número de entrada
        if not isinstance(romano, str):
            raise TypeError

        if not re.search(r"^M{0,3}(CM|CD|D?C{0,3})?(XC|XL|L?X{0,3})?(IX|IV|V?I{0,3})?$", romano.strip().upper()):
            raise ValueError('Número romano inválido.')

        # Formata o valor de entrada para tamanho par
        entrada = romano.upper() + ' '

        # Converte os valores
        saida = 0

        i = 0
        while i < len(entrada) - 1:
            bloco = entrada[i] + entrada[i + 1]

            # Verifica se é um número de 2 dígitos
            if bloco in self.__NUMERAIS_ROMANOS_DUPLOS:
                saida += self.__NUMERAIS_ROMANOS_DUPLOS[bloco]
                i += 2
            else:
                saida += self.__NUMERAIS_ROMANOS_UNICOS[entrada[i]]
                i += 1

        return saida
