package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasOriginalVersion extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetHasOriginalVersion currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasOriginalVersion.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasOriginalVersionIterator theDatasetHasOriginalVersionIterator = (DatasetHasOriginalVersionIterator)findAncestorWithClass(this, DatasetHasOriginalVersionIterator.class);
			pageContext.getOut().print(theDatasetHasOriginalVersionIterator.getHasOriginalVersion());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

