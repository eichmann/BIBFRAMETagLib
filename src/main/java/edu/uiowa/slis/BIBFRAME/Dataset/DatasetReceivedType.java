package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetReceivedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetReceivedType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetReceivedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetReceivedIterator theDatasetReceivedIterator = (DatasetReceivedIterator)findAncestorWithClass(this, DatasetReceivedIterator.class);
			pageContext.getOut().print(theDatasetReceivedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for received tag ");
		}
		return SKIP_BODY;
	}
}

