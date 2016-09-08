package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetSeparatedIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetSeparatedIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetSeparatedIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetSeparatedIntoIterator theDatasetSeparatedIntoIterator = (DatasetSeparatedIntoIterator)findAncestorWithClass(this, DatasetSeparatedIntoIterator.class);
			pageContext.getOut().print(theDatasetSeparatedIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

