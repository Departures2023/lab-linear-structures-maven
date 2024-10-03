package edu.grinnell.csc207.experiments;

import edu.grinnell.csc207.linear.LinkedStack;
import edu.grinnell.csc207.linear.ReportingLinearStructure;

/**
 * A really simple experiment with LinkedStack objects.
 *
 * @author Samuel A. Rebelsky
 * @author Khanh Do, Kevin Tang
 */
public class LinkedStackExperiment {
  /**
   * Do all the work. (Well, make the helpers do all the work.)
   */
  public static void main(String[] args) throws Exception {
    LinearStructureExperiment.expt01(new LinkedStack<String>(), "linked.");
  } // main(String[])
} // class LinkedStackExperiment
