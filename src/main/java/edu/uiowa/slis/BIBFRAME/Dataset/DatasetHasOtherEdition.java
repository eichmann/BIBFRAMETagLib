package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasOtherEdition extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetHasOtherEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasOtherEdition.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasOtherEditionIterator theDatasetHasOtherEditionIterator = (DatasetHasOtherEditionIterator)findAncestorWithClass(this, DatasetHasOtherEditionIterator.class);
			pageContext.getOut().print(theDatasetHasOtherEditionIterator.getHasOtherEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

