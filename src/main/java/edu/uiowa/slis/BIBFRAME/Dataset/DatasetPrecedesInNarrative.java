package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetPrecedesInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetPrecedesInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetPrecedesInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetPrecedesInNarrativeIterator theDatasetPrecedesInNarrativeIterator = (DatasetPrecedesInNarrativeIterator)findAncestorWithClass(this, DatasetPrecedesInNarrativeIterator.class);
			pageContext.getOut().print(theDatasetPrecedesInNarrativeIterator.getPrecedesInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

