class Spreadsheet {

    // private int[][]sheet;
    private Map<String, Integer>sheet = new HashMap<>();
    
    public Spreadsheet(int rows) {
        // sheet = new int[rows][26];
    }
    
    public void setCell(String cell, int value) {
        // sheet[cell.charAt(0)]
        sheet.put(cell, value);
    }
    
    public void resetCell(String cell) {
        sheet.remove(cell);
    }
    
    public int getValue(String formula) {
        int i = formula.indexOf('+');
        int v1;
        int v2;
        String a = formula.substring(1,i);
        String b = formula.substring(i+1);
        if(Character.isDigit(a.charAt(0))){
            v1 = Integer.parseInt(a);
        }else{
            v1 = sheet.getOrDefault(a,0);
        }
        if(Character.isDigit(b.charAt(0))){
        // if(b.charAt(1).isDigit()){
            v2 = Integer.parseInt(b);
        }else{
            v2 = sheet.getOrDefault(b,0);
        }
    return v1+v2;

    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */