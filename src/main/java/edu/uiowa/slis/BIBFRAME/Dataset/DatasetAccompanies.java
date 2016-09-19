package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetAccompanies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetAccompanies currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetAccompanies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetAccompaniesIterator theDatasetAccompaniesIterator = (DatasetAccompaniesIterator)findAncestorWithClass(this, DatasetAccompaniesIterator.class);
			pageContext.getOut().print(theDatasetAccompaniesIterator.getAccompanies());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

