package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasOriginalVersionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetHasOriginalVersionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasOriginalVersionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasOriginalVersionInverseIterator theDatasetHasOriginalVersionInverseIterator = (DatasetHasOriginalVersionInverseIterator)findAncestorWithClass(this, DatasetHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theDatasetHasOriginalVersionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

