package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetFrequency extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetFrequency currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetFrequency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetFrequencyIterator theDataset = (DatasetFrequencyIterator)findAncestorWithClass(this, DatasetFrequencyIterator.class);
			pageContext.getOut().print(theDataset.getFrequency());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for frequency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for frequency tag ");
		}
		return SKIP_BODY;
	}
}

