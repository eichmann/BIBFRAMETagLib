package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetAccompaniesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetAccompaniesType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetAccompaniesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetAccompaniesIterator theDatasetAccompaniesIterator = (DatasetAccompaniesIterator)findAncestorWithClass(this, DatasetAccompaniesIterator.class);
			pageContext.getOut().print(theDatasetAccompaniesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

