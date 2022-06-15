from unittest import TestCase

from notebooks.esbd2.conversor_romano import ConversorRomano


class TestConversorRomano(TestCase):

    def test_to_int_unicos(self):
        """Teste dos valores definidos com um algarismo."""
        conversor = ConversorRomano()
        self.assertEqual(conversor.to_int('M'), 1000)
        self.assertEqual(conversor.to_int('D'), 500)
        self.assertEqual(conversor.to_int('C'), 100)
        self.assertEqual(conversor.to_int('L'), 50)
        self.assertEqual(conversor.to_int('X'), 10)
        self.assertEqual(conversor.to_int('V'), 5)
        self.assertEqual(conversor.to_int('I'), 1)

    def test_to_int_duplos(self):
        """Teste dos valores definidos com dois algarismos."""
        conversor = ConversorRomano()
        self.assertEqual(conversor.to_int('CM'), 900)
        self.assertEqual(conversor.to_int('CD'), 400)
        self.assertEqual(conversor.to_int('XC'), 90)
        self.assertEqual(conversor.to_int('XL'), 40)
        self.assertEqual(conversor.to_int('IX'), 9)
        self.assertEqual(conversor.to_int('IV'), 4)

    def test_to_int_3999(self):
        """Teste do maior número romano possível."""
        conversor = ConversorRomano()
        self.assertEqual(conversor.to_int('MMMCMXCIX'), 3999)

    def test_to_int(self):
        """Teste de números de diferentes tamanhos."""
        conversor = ConversorRomano()
        self.assertEqual(conversor.to_int('DV'), 505)
        self.assertEqual(conversor.to_int('LII'), 52)
        self.assertEqual(conversor.to_int('MCII'), 1102)
        self.assertEqual(conversor.to_int('CVIII'), 108)
        self.assertEqual(conversor.to_int('DCLXV'), 665)
        self.assertEqual(conversor.to_int('DCCXVII'), 717)
        self.assertEqual(conversor.to_int('MDCCLIV'), 1754)
        self.assertEqual(conversor.to_int('MMMDCCIV'), 3704)
        self.assertEqual(conversor.to_int('MDCCLXXXII'), 1782)
        self.assertEqual(conversor.to_int('MMDCCCXXXII'), 2832)

    def test_to_int_validos(self):
        """Teste se o número romano é válido."""
        conversor = ConversorRomano()
        self.assertRaises(ValueError, conversor.to_int, 'VDD')
        self.assertRaises(ValueError, conversor.to_int, 'IIM')
        self.assertRaises(ValueError, conversor.to_int, 'BANANA')
        self.assertRaises(ValueError, conversor.to_int, 'MMMMCMXCIX')

    def test_to_int_tipo(self):
        """Teste se o tipo de entrada é válido."""
        conversor = ConversorRomano()
        self.assertRaises(TypeError, conversor.to_int, 12)
        self.assertRaises(TypeError, conversor.to_int, ['III'])
