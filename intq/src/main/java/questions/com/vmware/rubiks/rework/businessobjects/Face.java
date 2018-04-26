package questions.com.vmware.rubiks.rework.businessobjects;


/**
 * Entire cube face with face splits.
 */
public class Face {
    public FaceSplit[] faceSplits;


    public Face(FaceSplit.Color color){
        /**
         * Overall for 6 faces, we have 9 splits at each face */
        faceSplits = new FaceSplit[9];
        for(int i = 0; i < faceSplits.length; i++){
            faceSplits[i] = new FaceSplit(color);
        }
    }

    /**
     * Overall for 6 faces, we have 9 splits at each face
     * @param array
     */
    public Face(FaceSplit.Color[] array){
        faceSplits = new FaceSplit[9];
        for (int i = 0; i < faceSplits.length; i++){
            faceSplits[i] = new FaceSplit(array[i]);
        }
    }


    //Returns a textual representation of Face
    public String printFace(){
        StringBuilder faceString = new StringBuilder();

        for(FaceSplit f: faceSplits){
            faceString.append(f.getName());
            System.out.println(f.toString());
        }
        return faceString.toString();

    }

    public static void main(String[] args){
        Face face = new Face(FaceSplit.Color.B);
        System.out.println(face.toString());
    }
}
