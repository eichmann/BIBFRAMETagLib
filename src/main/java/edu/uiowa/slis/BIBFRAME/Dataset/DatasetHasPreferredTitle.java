package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasPreferredTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetHasPreferredTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasPreferredTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasPreferredTitleIterator theDatasetHasPreferredTitleIterator = (DatasetHasPreferredTitleIterator)findAncestorWithClass(this, DatasetHasPreferredTitleIterator.class);
			pageContext.getOut().print(theDatasetHasPreferredTitleIterator.getHasPreferredTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

