package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetSeparatedInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetSeparatedInto currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetSeparatedInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetSeparatedIntoIterator theDatasetSeparatedIntoIterator = (DatasetSeparatedIntoIterator)findAncestorWithClass(this, DatasetSeparatedIntoIterator.class);
			pageContext.getOut().print(theDatasetSeparatedIntoIterator.getSeparatedInto());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

