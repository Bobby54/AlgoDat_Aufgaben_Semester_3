package algodat;

public class Element {
    private Element pred;           //predecessor Element
    private Element succ;           //successor Element
    private Data data;


    public Element( Element pred, Element succ, Data data){
        setPred(pred);
        setSucc(succ);
        setData(data);
    }

    //Getter
    public Element getPred(){ return pred; }
    public Element getSucc(){ return succ; }
    public Data getData(){ return data; }

    //Setter
    public void setPred(Element pred){ this.pred = pred; }
    public void setSucc(Element succ){ this.succ = succ; }
    public void setData(Data data){ this.data = data; }
}
