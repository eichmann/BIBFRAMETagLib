package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasOtherEditionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetHasOtherEditionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasOtherEditionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasOtherEditionInverseIterator theDatasetHasOtherEditionInverseIterator = (DatasetHasOtherEditionInverseIterator)findAncestorWithClass(this, DatasetHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theDatasetHasOtherEditionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

