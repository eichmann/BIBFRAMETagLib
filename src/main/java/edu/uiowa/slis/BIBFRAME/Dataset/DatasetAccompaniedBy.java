package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetAccompaniedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetAccompaniedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetAccompaniedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetAccompaniedByIterator theDatasetAccompaniedByIterator = (DatasetAccompaniedByIterator)findAncestorWithClass(this, DatasetAccompaniedByIterator.class);
			pageContext.getOut().print(theDatasetAccompaniedByIterator.getAccompaniedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}

