/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dash.freq.controller;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.dash.freq.view.AppendText;
import org.dash.freq.view.PhycusGui;

/**
 *
 * @author kaeaton
 */
public class HaplotypeProcessor {
	
	private List<String> haplotypeTemplate = new ArrayList();
	private List<String> currentHaplotype = new ArrayList();
	
	public HaplotypeProcessor (String firstHaplotypeLine)
	{
		// break haplotypes down to individual loci
		String[] firstHaplotypes = firstHaplotypeLine.split("~");
//		System.out.println(firstHaplotypes);

		// add individual loci to haplotype template
		for (String locus:firstHaplotypes)
		{
			String[] locusName = locus.split("\\*");
//			System.out.println(locus);
			haplotypeTemplate.add(locusName[0]);
		}
		
		// sort loci alphabetically
		Collections.sort(haplotypeTemplate);
	}
	
	// make sure all same loci are present in each haplotype
	public boolean checkLoci (String currentLoci)
	{
		boolean sameLociFlag = false;
		currentHaplotype.clear();
		
		// break haplotypes down to individual loci
		String[] brokenDownHaplotype = currentLoci.split("~");

		// add individual loci to haplotype template
		for (String locus:brokenDownHaplotype){
			String[] locusName = locus.split("\\*");
			System.out.println(locus);
			currentHaplotype.add(locusName[0]);
		}
		
		// sort loci alphabetically
		Collections.sort(currentHaplotype);
		System.out.println(currentHaplotype);
		
		if (currentHaplotype.equals(haplotypeTemplate))
		{
			sameLociFlag = true;
		}

		return sameLociFlag;
	}
	
	// checking for things like this: A*01:01gA*01:01g
	public boolean asteriksAndTildas (String currentLoci)
	{
		boolean astTilFlag = false;
		
		int asteriks = StringUtils.countMatches(currentLoci, '*');
		System.out.println(asteriks);
		int tildas = StringUtils.countMatches(currentLoci, '~');
		System.out.println(tildas);

		
		// there should be one more asterisk than tilda
		if (asteriks == (tildas + 1)) 
		{
			astTilFlag = true;
		}
		
		return astTilFlag;
	}
	
	public void printOutErrors (ArrayList<String> errorLineNumbers)
	{
		// verbose error reporting?
		boolean verboseState = PhycusGui.verboseCheckBox.isSelected();
		
		// how many errors to list for non-verbose reporting
		int errorCounter = 3;
		
		// if there are "errorCounter" or fewer errors list them
		if(errorLineNumbers.size() <= errorCounter)
		{
			for (String lineError:errorLineNumbers)
			{
				haplotypeErrorParser(lineError);
			}
		}
		
		// otherwise list some and message that there are more
		else if (!verboseState)
		{
			int listCursor = 0;
		
			while (errorCounter > 0)
			{
				haplotypeErrorParser(errorLineNumbers.get(listCursor));
				
				errorCounter--;
				listCursor++;
			}
			
			// plus anything over 5
			int remainingErrors = errorLineNumbers.size() - errorCounter;
			AppendText.appendToPane(PhycusGui.outputTextPane, ("  - Plus " + remainingErrors + " more"), Color.RED);
			AppendText.appendToPane(PhycusGui.outputTextPane, System.lineSeparator(), Color.BLACK);
		}
		
		// if verbose is true, list all of the errors
		else
		{
			for (String lineError:errorLineNumbers)
			{
				haplotypeErrorParser(lineError);
			}
		}
	}
	
	public void haplotypeErrorParser(String errorLine)
	{
		// split the error line and print it out
		String[] parsedError = errorLine.split(":");
		
		AppendText.appendToPane(PhycusGui.outputTextPane, ("  - Line " + parsedError[0] + ErrorCodes.haplotypeErrorList().get(Integer.parseInt(parsedError[1])) + parsedError[0]), Color.RED);
		AppendText.appendToPane(PhycusGui.outputTextPane, System.lineSeparator(), Color.BLACK);
	}
}

