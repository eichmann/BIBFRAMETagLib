package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasPart extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetHasPart currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasPart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasPartIterator theDatasetHasPartIterator = (DatasetHasPartIterator)findAncestorWithClass(this, DatasetHasPartIterator.class);
			pageContext.getOut().print(theDatasetHasPartIterator.getHasPart());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

