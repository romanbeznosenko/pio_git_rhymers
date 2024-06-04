package edu.kis.vh.nursery;

/**
 * Klasa reprezentuje system liczenia z wyjmowaniem elementów.
 */
public class DefaultCountingOutRhymer {

    /**
     * Maksymalny rozmiar listy
     */
    private static final int NUMBERS_SIZE = 12;

    /**
     * Kod błędu zwracany przy nieprawidłowym wywołaniu funkcji
     */
    private static final int ERROR_CODE = -1;
    
    /**
     * Początkowa wartość wskazująca na pustą listę
     */
    private static final int EMPTY_RHYMER_INDICATOR = -1;

    /**
     * Tablica przechowująca liczby o rozmiarze NUMBERS_SIZE
     */
    private final int[] numbers = new int[NUMBERS_SIZE];

    /**
     * Indeks ostatnio dodanego elementu do listy
     */
    public int total = EMPTY_RHYMER_INDICATOR;

    /**
     * Dodaje podaną wartość na koniec listy, jeśli lista nie jest pełna.
     * @param in Wartość dodawana na koniec listy
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy lista jest pusta.
     * @return true jeśli indeks ostatnio dodanego elementu jest EMPTY_RHYMER_INDICATOR (-1),
     * false w przeciwnym razie.
     */
    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    /**
     * Sprawdza, czy lista jest pełna.
     * @return true jeśli indeks ostatnio dodanego elementu jest o 1 mniejszy niż NUMBERS_SIZE,
     * false w przeciwnym razie.
     */
    public boolean isFull() {
        return total == NUMBERS_SIZE - 1;
    }

    /**
     * Zwraca ostatnio dodany element z listy bez usuwania go, jeśli lista nie jest pusta.
     * @return ERROR_CODE (-1) jeśli lista jest pusta,
     * numbers[total] jeśli lista nie jest pusta.
     */
    protected int peekaboo() {
        if (callCheck())
            return ERROR_CODE;
        return numbers[total];
    }

    /**
     * Zwraca i usuwa ostatnio dodany element z listy, jeśli lista nie jest pusta.
     * @return ERROR_CODE (-1) jeśli lista jest pusta,
     * numbers[total--] jeśli lista nie jest pusta.
     */
    public int countOut() {
        if (callCheck())
            return ERROR_CODE;
        return numbers[total--];
    }

}
