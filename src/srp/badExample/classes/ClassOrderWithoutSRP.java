package srp.badExample.classes;

// Essa classe lida com 3 informações
// Informações do pedido, Exibição e Manipulação dos dados
public class ClassOrderWithoutSRP {

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

    public void printOrder(){
        System.out.println("Imprimindo ordem");
    }

    public void showOrder(){
        System.out.println("Exibindo ordem");
    }

    public void load(){
        System.out.println("Loading");
    }

    public void save(){
        System.out.println("Saving");
    }

    public void update(){
        System.out.println("Updating");
    }

    public void delete(){
        System.out.println("Deleting");
    }

}
