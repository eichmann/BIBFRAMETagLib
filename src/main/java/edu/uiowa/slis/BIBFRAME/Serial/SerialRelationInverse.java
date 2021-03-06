package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialRelationInverseIterator theSerialRelationInverseIterator = (SerialRelationInverseIterator)findAncestorWithClass(this, SerialRelationInverseIterator.class);
			pageContext.getOut().print(theSerialRelationInverseIterator.getRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for relation tag ");
		}
		return SKIP_BODY;
	}
}

