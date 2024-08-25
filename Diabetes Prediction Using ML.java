package ml;

		import java.util.ArrayList;
		import java.util.List;
		import java.util.Scanner;

		public class SimpleDecisionTree {

		    static class Instance {
		        double preg;
		        double glucose;
		        double bloodPressure;
		        double skinThickness;
		        double insulin;
		        double bmi;
		        double pedigreeFunction;
		        double age;
		        String classLabel;

		        Instance(double preg, double glucose, double bloodPressure, double skinThickness,
		                 double insulin, double bmi, double pedigreeFunction, double age, String classLabel) {
		            this.preg = preg;
		            this.glucose = glucose;
		            this.bloodPressure = bloodPressure;
		            this.skinThickness = skinThickness;
		            this.insulin = insulin;
		            this.bmi = bmi;
		            this.pedigreeFunction = pedigreeFunction;
		            this.age = age;
		            this.classLabel = classLabel;
		        }
		    }

		    static class DecisionTree {
		        // Basic decision tree classifier (simplified for demonstration purposes)
		        public String classify(Instance instance) {
		            if (instance.glucose > 120) {
		                return "pos";
		            } else {
		                return "neg";
		            }
		        }
		    }

		    public static void main(String[] args) {
		        // Create a small dataset
		        List<Instance> dataset = new ArrayList<>();
		        dataset.add(new Instance(6, 148, 72, 35, 0, 33.6, 0.627, 50, "pos"));
		        dataset.add(new Instance(1, 85, 66, 29, 0, 26.6, 0.351, 31, "neg"));
		        dataset.add(new Instance(8, 183, 64, 0, 0, 23.3, 0.672, 32, "pos"));
		        dataset.add(new Instance(1, 89, 66, 23, 94, 28.1, 0.167, 21, "neg"));
		        dataset.add(new Instance(0, 137, 40, 35, 168, 43.1, 2.288, 33, "pos"));

		        // Create and train the decision tree
		        DecisionTree tree = new DecisionTree();

		        // Create a Scanner object for user input
		        Scanner scanner = new Scanner(System.in);

		        // Prompt user for input
		        System.out.print("Enter pregnancy count: ");
		        double preg = scanner.nextDouble();

		        System.out.print("Enter glucose level: ");
		        double glucose = scanner.nextDouble();

		        System.out.print("Enter blood pressure: ");
		        double bloodPressure = scanner.nextDouble();

		        System.out.print("Enter skin thickness: ");
		        double skinThickness = scanner.nextDouble();

		        System.out.print("Enter insulin level: ");
		        double insulin = scanner.nextDouble();

		        System.out.print("Enter BMI: ");
		        double bmi = scanner.nextDouble();

		        System.out.print("Enter diabetes pedigree function: ");
		        double pedigreeFunction = scanner.nextDouble();

		        System.out.print("Enter age: ");
		        double age = scanner.nextDouble();

		        // Close the scanner
		        scanner.close();

		        // Test the classifier with the user input
		        Instance testInstance = new Instance(preg, glucose, bloodPressure, skinThickness, insulin, bmi, pedigreeFunction, age, null);
		        String prediction = tree.classify(testInstance);

		        System.out.println("Prediction for the entered data: " + prediction);
		    }
		}

	
