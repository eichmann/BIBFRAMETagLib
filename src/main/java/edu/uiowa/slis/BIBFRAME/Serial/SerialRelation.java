package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialRelationIterator theSerialRelationIterator = (SerialRelationIterator)findAncestorWithClass(this, SerialRelationIterator.class);
			pageContext.getOut().print(theSerialRelationIterator.getRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for relation tag ");
		}
		return SKIP_BODY;
	}
}

