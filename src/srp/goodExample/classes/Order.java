package srp.goodExample.classes;

public class Order {

    public Integer calculateTotalSum(Integer a, Integer b) {
        return a + b;
    }

    public String getItems(){
        return "Retorno dos itens";
    }

    public Integer getItemCount(){
        return 3;
    }

    public void addItem(String item){
        System.out.println("Item " + item + " adicionado");
    }

    public void deleteItem(String item){
        System.out.println("Item " + item + " deletado");
    }

}
