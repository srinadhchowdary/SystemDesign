
// 1. Base class defining the template method

public abstract class ModelTrainer {
    
    public final void trainPipeline(String dataPath) {
        loadData(dataPath);
        preprocessData();
        trainModel();
        evaluateModel();
        saveModel();    
    }
    
    protected void loadData(String path){
        System.out.println("[Common] Loading dataset from: " + path);
    }
    
    protected void preprocessData() {
        System.out.println("[Common] Preprocessing data Splitting into train/test and normalizing...");
    }
    
    protected abstract void trainModel();
    protected abstract void evaluateModel();
    
    protected void saveModel(){
        System.out.println("[Common] Saving model to disk as default format...");
    }
}
