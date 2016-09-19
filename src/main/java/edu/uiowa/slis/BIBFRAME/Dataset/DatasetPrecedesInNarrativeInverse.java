package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetPrecedesInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetPrecedesInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetPrecedesInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetPrecedesInNarrativeInverseIterator theDatasetPrecedesInNarrativeInverseIterator = (DatasetPrecedesInNarrativeInverseIterator)findAncestorWithClass(this, DatasetPrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theDatasetPrecedesInNarrativeInverseIterator.getPrecedesInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

