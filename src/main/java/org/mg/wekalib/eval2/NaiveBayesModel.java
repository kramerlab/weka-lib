package org.mg.wekalib.eval2;

import weka.classifiers.Classifier;
import weka.classifiers.bayes.NaiveBayes;

public class NaiveBayesModel extends AbstractModel
{
	private static final long serialVersionUID = 1L;

	@Override
	public int getParamKey()
	{
		return 0;
	}

	@Override
	public Classifier getWekaClassifer()
	{
		return new NaiveBayes();
	}
}