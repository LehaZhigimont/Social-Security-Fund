enum  Month {
    JAN("01"), FEB("02"), MAR("03"), APR("04"), MAY("05"), JUN("06"), JUL("07"),
    AUG("08"), SEP("09"), OCT("10"), NOV("11"), DEC("12");
    private String numbMonth;

    Month(String numbMonth) {
        this.numbMonth = numbMonth;
    }

    public String getNumbMonth() {
        return numbMonth;
    }
}
