package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(TextFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TextFormDesignationIterator theText = (TextFormDesignationIterator)findAncestorWithClass(this, TextFormDesignationIterator.class);
			pageContext.getOut().print(theText.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

