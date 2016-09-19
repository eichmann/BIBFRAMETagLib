package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrintRelationIterator thePrintRelationIterator = (PrintRelationIterator)findAncestorWithClass(this, PrintRelationIterator.class);
			pageContext.getOut().print(thePrintRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for relation tag ");
		}
		return SKIP_BODY;
	}
}

