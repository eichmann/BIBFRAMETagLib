package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetIsPartOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetIsPartOf currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetIsPartOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetIsPartOfIterator theDatasetIsPartOfIterator = (DatasetIsPartOfIterator)findAncestorWithClass(this, DatasetIsPartOfIterator.class);
			pageContext.getOut().print(theDatasetIsPartOfIterator.getIsPartOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

