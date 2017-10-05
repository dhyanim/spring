package com.designpatterns.strategySimple;

import java.io.File;
import java.util.ArrayList;

import com.designpatterns.strategy.compression.CompressionStrategy;

public class RarCompressionStrategy implements CompressionStrategy {

	@Override
	public void compressFiles(ArrayList<File> files) {
		System.out.println("compressing files using Rar");
		
	}

}
