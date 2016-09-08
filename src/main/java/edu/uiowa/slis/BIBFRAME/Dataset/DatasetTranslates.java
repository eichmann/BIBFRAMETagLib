package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetTranslates extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetTranslates currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetTranslates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetTranslatesIterator theDatasetTranslatesIterator = (DatasetTranslatesIterator)findAncestorWithClass(this, DatasetTranslatesIterator.class);
			pageContext.getOut().print(theDatasetTranslatesIterator.getTranslates());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for translates tag ");
		}
		return SKIP_BODY;
	}
}

