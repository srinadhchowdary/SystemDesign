public class NeuralNetworkTrainer extends ModelTrainer{
    
    @Override
    protected void trainModel() {
        System.out.println("[NeuralNet] Training Neural Network for 100 epochs");
    }

    @Override
    protected void evaluateModel() {
        System.out.println("[NeuralNet] Evaluating accuracy and loss on validation set");

    }
    
    @Override
    protected void saveModel(){
        System.out.println("[NeuralNetworkTrainer] Saving model to disk as .nn format...");
    }
}
