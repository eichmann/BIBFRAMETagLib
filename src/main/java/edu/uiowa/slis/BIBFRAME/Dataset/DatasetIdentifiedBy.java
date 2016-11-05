package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetIdentifiedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetIdentifiedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetIdentifiedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetIdentifiedByIterator theDatasetIdentifiedByIterator = (DatasetIdentifiedByIterator)findAncestorWithClass(this, DatasetIdentifiedByIterator.class);
			pageContext.getOut().print(theDatasetIdentifiedByIterator.getIdentifiedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

