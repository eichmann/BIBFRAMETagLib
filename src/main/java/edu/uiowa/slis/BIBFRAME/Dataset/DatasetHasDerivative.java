package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasDerivative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetHasDerivative currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasDerivative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasDerivativeIterator theDatasetHasDerivativeIterator = (DatasetHasDerivativeIterator)findAncestorWithClass(this, DatasetHasDerivativeIterator.class);
			pageContext.getOut().print(theDatasetHasDerivativeIterator.getHasDerivative());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

