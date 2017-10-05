package com.designpatterns.strategySimple;

import java.io.File;
import java.util.ArrayList;

import com.designpatterns.strategy.compression.ZipCompressionStrategy;

public class CompressionClient {

	
	public static void main(String[] args) {
		CompressionContext ctx = new CompressionContext();
		ctx.setCompressionStrategy(new ZipCompressionStrategy());
		ctx.createArchive(new ArrayList<File>());
	}
}
