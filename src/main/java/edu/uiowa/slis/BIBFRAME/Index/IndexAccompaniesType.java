package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexAccompaniesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexAccompaniesType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexAccompaniesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexAccompaniesIterator theIndexAccompaniesIterator = (IndexAccompaniesIterator)findAncestorWithClass(this, IndexAccompaniesIterator.class);
			pageContext.getOut().print(theIndexAccompaniesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

