package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasOtherEditionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetHasOtherEditionType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasOtherEditionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasOtherEditionIterator theDatasetHasOtherEditionIterator = (DatasetHasOtherEditionIterator)findAncestorWithClass(this, DatasetHasOtherEditionIterator.class);
			pageContext.getOut().print(theDatasetHasOtherEditionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

