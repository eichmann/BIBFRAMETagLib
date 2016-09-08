package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetIdentifiedByIterator theDatasetIdentifiedByIterator = (DatasetIdentifiedByIterator)findAncestorWithClass(this, DatasetIdentifiedByIterator.class);
			pageContext.getOut().print(theDatasetIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

