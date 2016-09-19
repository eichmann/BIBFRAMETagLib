package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetPrecedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetPrecedes currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetPrecedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetPrecedesIterator theDatasetPrecedesIterator = (DatasetPrecedesIterator)findAncestorWithClass(this, DatasetPrecedesIterator.class);
			pageContext.getOut().print(theDatasetPrecedesIterator.getPrecedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for precedes tag ");
		}
		return SKIP_BODY;
	}
}

