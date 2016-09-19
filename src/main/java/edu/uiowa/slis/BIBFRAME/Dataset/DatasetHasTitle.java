package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasTitleIterator theDatasetHasTitleIterator = (DatasetHasTitleIterator)findAncestorWithClass(this, DatasetHasTitleIterator.class);
			pageContext.getOut().print(theDatasetHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

