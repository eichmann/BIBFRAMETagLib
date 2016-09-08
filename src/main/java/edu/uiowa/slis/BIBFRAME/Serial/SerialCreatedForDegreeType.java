package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialCreatedForDegreeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialCreatedForDegreeType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialCreatedForDegreeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialCreatedForDegreeIterator theSerialCreatedForDegreeIterator = (SerialCreatedForDegreeIterator)findAncestorWithClass(this, SerialCreatedForDegreeIterator.class);
			pageContext.getOut().print(theSerialCreatedForDegreeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}

