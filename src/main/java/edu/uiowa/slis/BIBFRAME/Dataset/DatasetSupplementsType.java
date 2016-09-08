package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetSupplementsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetSupplementsType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetSupplementsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetSupplementsIterator theDatasetSupplementsIterator = (DatasetSupplementsIterator)findAncestorWithClass(this, DatasetSupplementsIterator.class);
			pageContext.getOut().print(theDatasetSupplementsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for supplements tag ");
		}
		return SKIP_BODY;
	}
}

