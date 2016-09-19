package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetFormDesignationIterator theDataset = (DatasetFormDesignationIterator)findAncestorWithClass(this, DatasetFormDesignationIterator.class);
			pageContext.getOut().print(theDataset.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

