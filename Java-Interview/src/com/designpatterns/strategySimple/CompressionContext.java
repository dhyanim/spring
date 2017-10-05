package com.designpatterns.strategySimple;

import java.io.File;
import java.util.ArrayList;

import com.designpatterns.strategy.compression.CompressionStrategy;

public class CompressionContext {
	
	private CompressionStrategy strategy;
	
	public void setCompressionStrategy(CompressionStrategy strategy){
		this.strategy = strategy;
	}
	
	public void createArchive(ArrayList<File> files){
		strategy.compressFiles(files);
	}

}
