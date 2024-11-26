package EntityList;
import Entity.Clothe;

public class ClothesList {
    private Clothe clothes[];

    public ClothesList() {
        clothes = new Clothe[5];
    }

    public ClothesList(int size) {
        clothes = new Clothe[size];
    }

    public void insert(Clothe c) {
        boolean flag = false;
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] == null) {
                clothes[i] = c;
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Successfully Inserted.");
        } else {
            System.out.println("Insertion Failed.");
        }
    }

    public Clothe getById(String productId) {
        boolean flag = false;
        Clothe c = null;
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] != null) {
                if (clothes[i].getProductId().equals(productId)) {
                    c = clothes[i];
                    flag = true;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("clothe found.");
        } else {
            System.out.println("clothe not found.");
        }
        return c;
    }

    public void removeById(String productId) {
        boolean flag = false;
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] != null) {
                if (clothes[i].getProductId().equals(productId)) {
                    clothes[i] = null;
                    flag = true;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("clothe Removed.");
        } else {
            System.out.println("clothes not found with this id.");
        }
    }

   /* public void showInfo() {
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] != null) {
                System.out.println("-------------");
			
                clothes[i].showInfo();
                System.out.println("-------------");
            }
        }
    }*/
	public String getAllClotheAsString(){
		String allClothe=" ";
		for(int i=0;i<clothes.length;i++){
			if(clothes[i]!=null){
				allClothe += "-------------"+"\n"+
							clothes[i].getClotheAsString()+"\n"+
							"-------------"+"\n";
			}
		}
		return allClothe;
	}
    public String getClotheTypeAsString(String clotheType){
		String allClothe="";
		for(int i=0;i<clothes.length;i++){
			if(clothes[i]!=null){
				if(clothes[i].getClotheType().equals(clotheType)){
					allClothe += "-------------"+"\n"+
								clothes[i].getClotheAsString()+"\n"+
								"-------------"+"\n";
				}
			}
		}
		return allClothe;
	}
	
	
}



