package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetSupersededBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetSupersededBy currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetSupersededBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetSupersededByIterator theDatasetSupersededByIterator = (DatasetSupersededByIterator)findAncestorWithClass(this, DatasetSupersededByIterator.class);
			pageContext.getOut().print(theDatasetSupersededByIterator.getSupersededBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

