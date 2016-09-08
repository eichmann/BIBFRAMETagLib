package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasSupplementType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetHasSupplementType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasSupplementType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasSupplementIterator theDatasetHasSupplementIterator = (DatasetHasSupplementIterator)findAncestorWithClass(this, DatasetHasSupplementIterator.class);
			pageContext.getOut().print(theDatasetHasSupplementIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

