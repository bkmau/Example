package exercise_08;

public class Polymorphism {

	public static void main(String[] args) {
		RectangleFigure rectangle, rectRef;              
        BoxFigure box, boxRef;
        String msg = "";

        rectangle = new RectangleFigure(8, 5);
        msg += "This is the first time we see rectangle:\r" + rectangle  + "\r";
        
        box = new BoxFigure(10, 7, 3);               
        msg += "This is the first time we see box:\r" + box  + "\r";
        
        rectRef = rectangle;
        msg += "Some guys has RectangleFigure mask but it is:\r" + rectRef  + "\r";
        
        boxRef = box;
        msg += "Some guys has RectangleFigure mask but it is:\r" + boxRef  + "\r";
        
        rectRef = (RectangleFigure) boxRef;
        msg += "Some guys has RectangleFigure mask but it is:\r" + rectRef  + "\r"; 
        
        msg += "Let's use \"instanceof\" to found out who has mast is it...\r";
        if (rectRef instanceof BoxFigure)                   
            msg += "Someone has BoxFigure is an instance of BoxFigure\r";
        else                                              
        	msg += "Someone has BoxFigure is not an instance of BoxFigure\r";  

        if (rectangle instanceof BoxFigure)              
        	msg += "Someone claims that it is RectangleFigure but BoxFigure is\r";
        else                                           
        	msg += "Someone claims that it is RectangleFigure and it is\r";

        System.out.println(msg);

	}

}
