package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    private Example example;

    @BeforeEach
    public void init(){
        this.example = new Example();
    }

    @Test
    public void testSumar(){
        //Given - Teniendo
        int numberA = 3;
        int numberB = 3;

        //When - Cuando
        int result = example.sumar(numberA, numberB);

        //Then - Entonces
        assertNotNull(result);
        assertEquals(6, result);
        assertInstanceOf(Integer.class, result);

    }

    @Test
    public void checkPositivoTest(){
        //Given
        int number = 4;
        //When
        boolean result = example.checkPositivo(4);
        //Then
        assertTrue(result);
    }

    @Test
    public void checkNegativoTest(){
        int number = -4;

        assertThrows(IllegalArgumentException.class, () -> {
            example.checkPositivo(number);
        });
    }

    @Test
    public void contarLetrasATest(){
        String cadena = "cadena aleatoria";

        int result = example.contarLetrasA(cadena);
        assertEquals(5, result);
    }

    @Test
    public void contieneElementoTest(){
        //Given
        List<String> diasDeLaSemana = List.of("Lunes","Martes","Miercoles","Jueves","Viernes");
        String dia = "Martes";

        //When
        boolean result = this.example.contieneElemento(diasDeLaSemana,dia);

        //Then
        assertTrue(result);
    }

    @Test
    public void revertirCadenaTest(){
        //Given
        String cadena = "alreves";
        //When
        String result = this.example.revertirCadena(cadena);
        //Then
        assertEquals("severla", result);
    }

    @Test
    public void factorialTest(){
        int number = 6;

        long result = this.example.factorial(number);

        assertEquals(720, result);
    }

    @Test
    public void factorialErrorTest(){
        int number = -6;

        assertThrows(IllegalArgumentException.class, () -> {
            this.example.factorial(number);
        });
    }

    @Test
    public void esPrimoFalseTest(){
        int number1 = 1;

        boolean result = this.example.esPrimo(number1);
        assertEquals(false, result);
    }

    @Test
    public void esPrimoTrueTest(){
        //Given
        int number2 = 2;
        //When
        boolean result = this.example.esPrimo(number2);
        //Then
        assertTrue(result);

    }

    @Test
    public void noEsPrimoTest(){
        int number3 = 9;

        boolean result = this.example.esPrimo(number3);

        assertFalse(result);
    }

    @Test
    public void mensajeConRetrasoTest() throws InterruptedException {

        String result = this.example.mensajeConRetraso();

        assertEquals("Listo después de retraso", result);
    }

    @Test
    public void convertirAStringTest(){
        List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9);

        List<String> result = this.example.convertirAString(numeros);
        assertEquals(List.of("1","2","3","4","5","6","7","8","9"), result);
    }

    @Test
    public void cacularMediaTest(){
        List<Integer> numeros = List.of(1,2,3);

        double media = this.example.calcularMedia(numeros);

        assertEquals(2, media);
    }

    @Test
    public void calcularMediaNullTest(){
        List<Integer> numbers = null;

        assertThrows(IllegalArgumentException.class, () ->{
           this.example.calcularMedia(numbers);
        });
    }

    @Test
    public void calcularMediaEmptyTest(){
        List<Integer> numbers = List.of();

        assertThrows(IllegalArgumentException.class, () -> {
           this.example.calcularMedia(numbers);
        });
    }


    @Test
    public void convertirListaAStringTest(){
        List<String> saludo = List.of("hola","mundo");

        String resultado = this.example.convertirListaAString(saludo);

        assertEquals("HOLA,MUNDO", resultado);
    }

    /* private Example example;

    @BeforeEach
    public void init() {
        this.example = new Example();
    }

    @Test
    public void testSumar() {
        // Given - Teniendo
        int numberA = 3;
        int numberB = 3;

        // When - Cuando
        int result = example.sumar(numberA, numberB);

        // Then - Entonces
        assertNotNull(result);
        assertEquals(6, result);
        assertInstanceOf(Integer.class, result);
    }

    @Test
    public void testCheckPositivo() {
        // Given - Teniendo
        int number = 4;

        // When - Cuando
        boolean result = example.checkPositivo(number);

        // Then - Entonces
        assertTrue(result);
    }

    @Test
    public void testCheckPositivoError() {
        // Given
        int number = -4;

        // Then
        assertThrows(IllegalArgumentException.class, () -> {
            example.checkPositivo(number);
        });
    }

    @Test
    public void testContarLetrasA() {
        // Given
        String cadena = "unprogramadornace";

        // When
        int result = example.contarLetrasA(cadena);

        // Then
        assertNotNull(result);
        assertEquals(3, result);
    }

    @Test
    public void testContieneElemento() {
        // Given
        List<String> countries = List.of("Colombia", "Mexico", "Peru");
        String country = "Colombia";

        // When
        boolean result = this.example.contieneElemento(countries, country);

        // Then
        assertTrue(result);
    }

    @Test
    public void testRevertirCadena() {
        // Given
        String cadena = "carro"; // orrac

        // When
        String result = this.example.revertirCadena(cadena);

        // Then
        assertEquals("orrac", result);
    }

    @Test
    public void testFactorial() {
        // Given
        int number = 6;

        // When
        long result = this.example.factorial(number);

        // Then
        assertEquals(720, result);
    }

    @Test
    public void testFactorialError() {
        // Given
        int number = -6;

        // When - Then
        assertThrows(IllegalArgumentException.class, () -> {
            this.example.factorial(number);
        });
    }

    @Test
    public void testEsPrimo() {
        // Given
        int number = 3;

        // When
        boolean result = this.example.esPrimo(number);

        // Then
        assertTrue(result);
    }

    @Test
    public void testEsPrimoMayorACuatro() {
        // Given
        int number = 7;

        // When
        boolean result = this.example.esPrimo(number);

        // Then
        assertTrue(result);
    }

    @Test
    public void testEsPrimoMenorQueUno() {
        // Given
        int number = 1;

        // When
        boolean result = this.example.esPrimo(number);

        // Then
        assertFalse(result);
    }

    @Test
    public void testNoEsPrimo() {
        // Given
        int number = 9;

        // When
        boolean result = this.example.esPrimo(number);

        // Then
        assertFalse(result);
    }

    @Test
    public void testMensajeConRetraso() throws InterruptedException {
        // When
        String result = this.example.mensajeConRetraso();

        // Then
        assertEquals("Listo después de retraso", result);
    }

    @Test
    public void testConvertirAString() {
        // Given
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // When
        List<String> result = this.example.convertirAString(numbers);

        // Then
        assertEquals(List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10"), result);
    }

    @Test
    public void testCalcularMedia() {
        // Given
        List<Integer> numbers = List.of(1, 2, 3);

        // When
        double result = this.example.calcularMedia(numbers);

        // Then
        assertEquals(2, result);
    }

    @Test
    public void testCalcularMediaNull() {
        // Given
        List<Integer> numbers = null;

        // When - Then
        assertThrows(IllegalArgumentException.class, () -> {
            this.example.calcularMedia(numbers);
        });
    }

    @Test
    public void testCalcularMediaEmpty() {
        // Given
        List<Integer> numbers = Collections.emptyList();

        // When - Then
        assertThrows(IllegalArgumentException.class, () -> {
            this.example.calcularMedia(numbers);
        });
    }*/

}
